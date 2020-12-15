SUMMARY = "RubyGem: http-cookie"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265"
HOMEPAGE = "https://github.com/sparklemotion/http-cookie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f217a5829e26ed04a05e5ba14eaf2128"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-domain-name"

SRC_URI[md5sum] = "6a5ebc9f1b1f3628794c71b30ce7e5ec"
SRC_URI[sha256sum] = "2f11269d817bc52ab2af2721e89a377660a961078de2a3a55fc696d7897e8c00"

GEM_NAME = "http-cookie"

inherit rubygems
