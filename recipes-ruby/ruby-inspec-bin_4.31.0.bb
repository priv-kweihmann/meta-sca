SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "117d76f4d347a42a562dc2363713c443"
SRC_URI[sha256sum] = "62027165f6c1cd647961ca47beb1cdfafd104fdd46408a91301f3d4df8717b26"

GEM_NAME = "inspec-bin"

inherit rubygems
