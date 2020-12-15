SUMMARY = "RubyGem: sslshake"
DESCRIPTION = "This is a library to simulate SSL and TLS handshake from SSLv2, SSLv3, to TLS 1.0-1.2"
HOMEPAGE = "https://github.com/arlimus/sslshake"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://lib/sslshake/version.rb;beginline=3;endline=3;md5=5f1ff879ecd594e821b8158aa522a11d"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8c0aebc5eccad6081819caba346f05d7"
SRC_URI[sha256sum] = "1069c97ed93441e1e1c167fb59f0eb952f64156784d9b321f60528d4f5747164"

GEM_NAME = "sslshake"

inherit rubygems
