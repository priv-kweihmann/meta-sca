SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "c7e5f70fe2321da730acb62e47e96a3e"
SRC_URI[sha256sum] = "02ba96e0d23d274422c626881fbb4bcd44a25ff81c6937ba16bf18fa7f49c00a"

GEM_NAME = "inspec-bin"

inherit rubygems
