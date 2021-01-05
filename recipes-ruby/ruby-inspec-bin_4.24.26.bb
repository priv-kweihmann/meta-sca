SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "248afa094d8facfc8f4cf68165b8fcc3"
SRC_URI[sha256sum] = "ceefb439df8011f91643fbd9134120be570c0dc464dbb7685c8c826b355f30d0"

GEM_NAME = "inspec-bin"

inherit rubygems
