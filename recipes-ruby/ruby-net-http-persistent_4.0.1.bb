SUMMARY = "RubyGem: net-http-persistent"
DESCRIPTION = "Manages persistent connections using Net::HTTP including a thread pool forconnecting to multiple hosts.Using persistent HTTP connections can dramatically increase the speed of HTTP.Creating a new HTTP connection for every request involves an extra TCPround-trip and causes TCP congestion avoidance negotiation to start over.Net::HTTP supports persistent connections with some API methods but does notmake setting up a single persistent connection or managing multipleconnections easy"
HOMEPAGE = "https://github.com/drbrain/net-http-persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=59;endline=82;md5=e3fe655d8a232a8b4e8bde0439a4518f"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-connection-pool"

SRC_URI[md5sum] = "42857574ef30faa06e646a7f45292f4b"
SRC_URI[sha256sum] = "2752f4cce05fd1c45e0537c6f3a98fa5a4899efd5f88e63c104ed5f05cbddef9"

GEM_NAME = "net-http-persistent"

inherit rubygems
