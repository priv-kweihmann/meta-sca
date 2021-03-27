SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a2e0e281b9b6c47f722da2255eca5d68"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby \
                  ruby-i18n \
                  ruby-minitest \
                  ruby-tzinfo \
                  ruby-zeitwerk"

SRC_URI[md5sum] = "adf13ec272011f5fa74b0df6a2786357"
SRC_URI[sha256sum] = "8c263a78c1278d621be523185788c1fcc0de78d9cf572b7b08c6feb3f2831350"

GEM_NAME = "activesupport"

inherit rubygems
