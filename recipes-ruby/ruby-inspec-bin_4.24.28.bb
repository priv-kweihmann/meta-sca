SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "2f3c0f06c91821b2224dd015fb100c3c"
SRC_URI[sha256sum] = "39cbb294dfc088462e9c204dd936b24521b87ded89560010cdc9495ee2bd7c83"

GEM_NAME = "inspec-bin"

inherit rubygems
