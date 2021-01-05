SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "42d91e7b0a3c8050ae023905b1638b0b"
SRC_URI[sha256sum] = "3be7ddd6069e7b8c939a87290349d28bf13a0bf01a526bb42fdb0d31525f20cf"

GEM_NAME = "i18n"

inherit rubygems
