SUMMARY = "RubyGem: mixlib-shellout"
DESCRIPTION = "Run external commands on Unix or Windows"
HOMEPAGE = "https://github.com/chef/mixlib-shellout"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-chef-utils"

SRC_URI[md5sum] = "fc8718167959d7bfa6a8185eb56afc1c"
SRC_URI[sha256sum] = "121a54005e52b6596a945f7bfc95bbcbd7d8ee7685cb3736dd3cef5ff46029bd"

GEM_NAME = "mixlib-shellout"

inherit rubygems
