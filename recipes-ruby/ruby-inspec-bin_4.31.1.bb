SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "a5309f3e33ed9a352855691d979cc772"
SRC_URI[sha256sum] = "c9bc47caed52a46d143c3d97ab6c05a87b63eaa2772c2eef5fbba1af2da8c3b6"

GEM_NAME = "inspec-bin"

inherit rubygems
