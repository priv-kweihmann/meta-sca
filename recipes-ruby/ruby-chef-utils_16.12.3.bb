SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "f82526a98a949c195d768d4093ea2ff4"
SRC_URI[sha256sum] = "a8e8dc4bae73b23b5c4c4ff76fb6ce9dcfcd36cf5433e39f329ea3925174fd0d"

GEM_NAME = "chef-utils"

inherit rubygems
