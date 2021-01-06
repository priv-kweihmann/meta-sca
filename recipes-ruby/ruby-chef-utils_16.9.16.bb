SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "304a357ee91e20fb739f002f5aafd696"
SRC_URI[sha256sum] = "d8248951f4ae1f1410c61a51ade25a073c6b37410e388abdf28abd9cd1e6bc1b"

GEM_NAME = "chef-utils"

inherit rubygems
