SUMMARY = "RubyGem: erubi"
DESCRIPTION = "Erubi is a ERB template engine for ruby"
HOMEPAGE = "https://github.com/jeremyevans/erubi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=fae329f61cf5d96fc980000e188be0af"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e8111998389faf7fb877012fba4485ff"
SRC_URI[sha256sum] = "543802c294f917653feb650e0e77cbc33018cdb2da7910294aa80220c7a78826"

GEM_NAME = "erubi"

inherit rubygems
