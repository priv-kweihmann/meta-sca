SUMMARY = "RubyGem: rspec-core"
DESCRIPTION = "BDD for Ruby"
HOMEPAGE = "https://github.com/rspec/rspec-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3a5e8c0f5c7198772d1cfaa59805376d"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-rspec-support"

SRC_URI[md5sum] = "87e5e737957c991e79996c6374fc93c3"
SRC_URI[sha256sum] = "62fb2683bb961a3bdaddae1a5b966825fbd65e05ac7aad0c43dc1be1d06e5958"

GEM_NAME = "rspec-core"

inherit rubygems
