SUMMARY = "RubyGem: libyajl2"
DESCRIPTION = "Installs a vendored copy of libyajl2 for distributions which lack it"
HOMEPAGE = "https://github.com/chef/libyajl2-gem"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b9dd6929beac27cfcaa23d1277c59b02"
SRC_URI[sha256sum] = "595e815d7351c57d9d17b09501a958171561bdf534b08bfeed6fa144ad97a57c"

GEM_NAME = "libyajl2"

inherit rubygems

INSANE_SKIP_${PN} += "ldflags"
