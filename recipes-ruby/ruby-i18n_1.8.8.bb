SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "df6f6da16b388f79740fc35c74312392"
SRC_URI[sha256sum] = "7adb9849c22f4230c1e6d22d3a0cbba2e3de6a6fa40da64ddf385050f91df84c"

GEM_NAME = "i18n"

inherit rubygems
