SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e4f3a3f5136915adec242cb137928dc6"
SRC_URI[sha256sum] = "a0d7dabc6c0a09cf72587e5a2de7e6e251cdeba5a2b2c4f5b94f3917b0755bdb"

GEM_NAME = "chef-utils"

inherit rubygems
