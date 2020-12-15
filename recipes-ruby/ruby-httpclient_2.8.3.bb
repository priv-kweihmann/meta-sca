SUMMARY = "RubyGem: httpclient"
DESCRIPTION = "gives something like the functionality of libwww-perl (LWP) in Ruby"
HOMEPAGE = "https://github.com/nahi/httpclient"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://lib/httpclient/util.rb;beginline=4;endline=6;md5=f95668e0c05e0195fc9c95149ab4a296"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "0d43c4680b56547b942caa0d9fefa8ec"
SRC_URI[sha256sum] = "2951e4991214464c3e92107e46438527d23048e634f3aee91c719e0bdfaebda6"

GEM_NAME = "httpclient"

inherit rubygems
