package pw.theo.chicken;


import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileNotFoundException;

import static pw.theo.chicken.NameScanner.*;

public class Main extends JavaPlugin implements Listener
{

    File UserDirectory = new File( System.getProperty( "user.dir" ) );

    File n = new File( UserDirectory.getAbsolutePath( ) + File.separator + "names.txt" );

    @Override
    public void onEnable( )
    {
        Bukkit.getPluginManager( ).registerEvents( this, this );
    }

    @EventHandler
    public void onSpawn( EntitySpawnEvent e ) throws FileNotFoundException
    {
        if ( e.getEntityType( ).equals( EntityType.CHICKEN ) )
        {
            String[] a = arrayThatBitch( scanFileContents( n ) );

            int x = (int) numGen( a.length );

            e.getEntity( ).setCustomName( a[x] );

        }
    }

    public double numGen( int size )
    {
        return Math.random( ) * ( size - 1 + 1 ) + 1;
    }


}
