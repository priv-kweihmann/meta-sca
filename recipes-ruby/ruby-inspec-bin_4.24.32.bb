SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "d50eab0cb496f9cbb974b8d5eb4c8428"
SRC_URI[sha256sum] = "7cab8e958918630bdb74b8737de699bbfee8113a8c2537bbae41544d7520e8cd"

GEM_NAME = "inspec-bin"

inherit rubygems
