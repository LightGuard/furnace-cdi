package test.org.jboss.forge.furnace.mocks.services;

import javax.inject.Singleton;

import org.jboss.forge.furnace.services.Exported;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
@Exported
@Singleton
public class PublishedService
{
   public String getMessage()
   {
      return "I am PublishedService.";
   }

   public ClassLoader getClassLoader()
   {
      return getClass().getClassLoader();
   }
}
