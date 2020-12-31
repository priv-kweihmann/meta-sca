SUMMARY = "RubyGem: rspec-core"
DESCRIPTION = "BDD for Ruby"
HOMEPAGE = "https://github.com/rspec/rspec-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3a5e8c0f5c7198772d1cfaa59805376d"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-rspec-support"

SRC_URI[md5sum] = "38f47fe98c8266c8a555dddf5c5778e9"
SRC_URI[sha256sum] = "ac9abdc9577a3a34e9e92815603da8343931055ab4fba1c2a49de6dd3b749673"

GEM_NAME = "rspec-core"

inherit rubygems
