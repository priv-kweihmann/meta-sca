SUMMARY = "RubyGem: libyajl2"
DESCRIPTION = "Installs a vendored copy of libyajl2 for distributions which lack it"
HOMEPAGE = "https://github.com/chef/libyajl2-gem"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

DEPENDS += "gmp"
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8da54df196b302846165fc23cc727a09"
SRC_URI[sha256sum] = "aa5df6c725776fc050c8418450de0f7c129cb7200b811907c4c0b3b5c0aea0ef"

GEM_NAME = "libyajl2"

inherit rubygems

INSANE_SKIP_${PN} += "ldflags"
