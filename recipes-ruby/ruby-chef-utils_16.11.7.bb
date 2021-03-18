SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b4082dbeeb5a430722be23726670231d"
SRC_URI[sha256sum] = "ff943c8988115745b300acf01860b5f1627e99dbd1f42e5cd1fa364347a1b1f8"

GEM_NAME = "chef-utils"

inherit rubygems
