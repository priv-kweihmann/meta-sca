SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e958749e213e2c96195cb2e268cb8249"
SRC_URI[sha256sum] = "dccf8025f81454294d74c44e536daa1e715443ebdcbfead221f46514a90104a5"

GEM_NAME = "chef-utils"

inherit rubygems
