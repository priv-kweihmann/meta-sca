#!/usr/bin/perl
# $Id: mailto.pl 1.0 1995/01/03 19:05:15 michael Exp michael $
#
# written by Michael Kellen, February 1995
#
# MICHAEL KELLEN DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE,
# INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS, IN NO
# EVENT SHALL MICHAEL KELLEN BE LIABLE FOR ANY SPECIAL, INDIRECT OR
# CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF
# USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
# OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
# PERFORMANCE OF THIS SOFTWARE.
#

$mailer = "/usr/lib/sendmail -t <";
$HOME = "$ENV{'HOME'}";
$HOME = "/home/$ENV{'USER'}"	if (!$HOME);
$HOME = "/tmp"			if (!$HOME);

$retval = &ParseRequest;
&GetCall if $retval;
&PostCall;
&HTTPHappy;

sub
ParseRequest {
	# Parse incoming URL of the form
	#
	#  GET mailto:address  or POST mailto://server/group
        ($http_cmd, $http_uri, $http_id) = split (/\s+/, <>, 3);

	while (<>) {
		chop;
		($type,$value) = split ( '\s*:\s+' , $_, 2);
		if ($type eq "") {
                        last;
                }
		if ( $type eq "X-hostname" ) {
			$server = $value;
		}

		if ( $type eq "X-filename" ) {
			$address = $value;
		}
	}


	return 1  if ($http_cmd =~ /GET/);

	$_ = <STDIN>;
	chop ;
	($head,$body,$sig,$sign) = split( '&', $_, 4);
	$head =~ s/HEAD=//;
	$body =~ s/BODY=//;
	$sig  =~ s/SIG=//;
	$sign =~ s/SIGN=//;

	return 0;
}

sub
GetCall {

	$mailer = "$ENV{'MAIL_CLIENT'}";
	if ($mailer) {
		system ("$mailer $address");
		&Abort	if ($?);
		&HTTPHappy;
	}
		
	$sigfile = "$ENV{'SIGNATURE'}";
	$sigfile = "$HOME/.signature"   if (!$sigfile);
	if ( -r $sigfile ) {
		open (SIG, "$sigfile");
		while(<SIG>) {
			$signature .= $_;
		}
	close(SIG);
	} else {
		$signature = $sigfile;
	}
	$REPLYTO = "$ENV{'REPLYTO'}";
	$reply = "Reply-To: $REPLYTO\n";

	$form  = "<TITLE>Mailing to $address</TITLE>\n";
	$form .= "<BODY><FORM METHOD=POST ACTION=mailto:$address>\n";
	$form .= "<TEXTAREA NAME=HEAD ROWS=4 COLS=78>";
	$form .= "To: $address\nCc: \nSubject: \n$reply\n</TEXTAREA>\n";
	$form .= "<TEXTAREA NAME=BODY ROWS=15 COLS=78>";
	$form .= "</TEXTAREA>\n";
	$form .= "<HR>\n";
	$form .= "<TEXTAREA NAME=SIG ROWS=4 COLS=78>";
	$form .= "$signature</TEXTAREA>\n";
	$form .= "<INPUT TYPE=checkbox NAME=SIGN CHECKED>";
	$form .= " Append Signature ";
	$form .= "<input TYPE=submit VALUE=Mail>";
	$form .= "<input TYPE=reset VALUE=Reset><HR></form>";

	$form_length = length ($form);

	print "HTTP/1.0 200 OK\n";
	print "Content-type: text/html\n";
	print "Content-length: $form_length\n\n";
	print "$form\n";
	exit 0;
}

sub
PostCall {
	while ( $head =~ /([^%]*)%([0-9A-E][0-9A-E])(.*)/ ) {
		$head = sprintf("%s%c%s", $1,hex($2), $3);
	}
		
	while ( $body =~ /([^%]*)%([0-9A-E][0-9A-E])(.*)/ ) {
		$body = sprintf("%s%c%s", $1,hex($2), $3);
	}
	
	if ( $sign eq "on" ) {	
		while ( $sig =~ /([^%]*)%([0-9A-E][0-9A-E])(.*)/ ) {
			$sig = sprintf("%s%c%s", $1,hex($2), $3);
		}
	}


	open(TMP, ">$HOME/.letter");
	print TMP "$head\n";
	print TMP "$body\n";
	print TMP "--\n$sig\n"		if ($sign eq "on");
	close(TMP);

	system("$mailer $HOME/.letter");

	&Abort	if ($?);
	unlink "$HOME/.letter";
}

sub
Abort {
	$deadtmpfile = "$HOME/dead.letter";

	open(DEAD,">>$deadtmpfile");
	open(TMP,"$HOME/.letter");

	$\ = "";
	while(<TMPFILE>){
		print DEAD $_;
	}

	close(DEAD);
	close(TMPFILE);
	unlink "$HOME/.letter";
	
	$message  = "<TITLE>Mail Error</TITLE>\n";
	$message .= "<H1>Unable to send mail to $address</H1>\n";
	$message .= "<BR>A copy of the response has been appended to ";
	$message .= "<a href=file:$deadtmpfile>$deadtmpfile</a>\n";

	$content_length = length($message);

	print STDOUT "HTTP/1.0 200 OK\n";
	print STDOUT "Content-type: text/html\n";
	print STDOUT "Content-length: $content_length\n\n";

	print STDOUT $message;

	exit 0;
}

sub
HTTPHappy {

	print "HTTP/1.0 200 OK\n";
	print "Content-type: application/none\n";
	print "Content-length: 10\n\n";
	print "Mail Done\n";

	exit 0;
}


