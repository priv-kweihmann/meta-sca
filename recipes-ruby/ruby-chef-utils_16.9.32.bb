SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "f99f890f9344b811a7121ed9123cb4b8"
SRC_URI[sha256sum] = "9fded937c9ba24d05e4f11ebc1976d84069bebbb1a8aafc39bc558b7d5ae9131"

GEM_NAME = "chef-utils"

inherit rubygems
