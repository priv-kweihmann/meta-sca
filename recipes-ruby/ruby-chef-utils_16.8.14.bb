SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "c137b974e300121657b66e64c4ebbdf7"
SRC_URI[sha256sum] = "372ee0fddbf249799ca88064aaa269b5bea09f2197dcbfd6c8af0f54a8b37f70"

GEM_NAME = "chef-utils"

inherit rubygems
