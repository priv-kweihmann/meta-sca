SUMMARY = "RubyGem: mixlib-shellout"
DESCRIPTION = "Run external commands on Unix or Windows"
HOMEPAGE = "https://github.com/chef/mixlib-shellout"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-chef-utils"

SRC_URI[md5sum] = "8eeb0bae928790721f2396e35443a562"
SRC_URI[sha256sum] = "e90bc2af9bc1fcaacab9e51b2453302a9f3ca135489dbf91d5ebc236e1053f78"

GEM_NAME = "mixlib-shellout"

inherit rubygems
