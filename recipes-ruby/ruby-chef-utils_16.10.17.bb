SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8e185c6a525ec9ec76f0318a99606839"
SRC_URI[sha256sum] = "a74253da6aab8ff92c955549536bdecbc4d1ce8032c8201576f2a8ef4e8ed7b3"

GEM_NAME = "chef-utils"

inherit rubygems
