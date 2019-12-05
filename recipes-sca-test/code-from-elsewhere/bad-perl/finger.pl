#!/usr/bin/perl

print 'HTTP/1.0';
print "\nContent-type: text/html\n\n";
print '<PRE>';
print "\n";

while (<>)
{
	next unless $_ =~ /^GET/;
	chop;
	@line = split;
	$user = $line_[1];
	{
		open(FINGER, "/usr/bin/finger -l $user |");
		while(<FINGER>)
		{
			print
		}
		close (FINGER);
		exit 0;
       	}
	break;
}
exit 1;
