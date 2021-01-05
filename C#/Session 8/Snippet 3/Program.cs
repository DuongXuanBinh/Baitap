using System;

namespace Snippet_3
{
    class IntelliSenseDemo : TimeZone
    {
        public override string DaylightName
        {
            get { throw new Exception("The method or operation is not implemented");
            }
        }
        public override System.Globalization.DaylightTime GetDaylightChanges(int years)
        {

        }
    }
