SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "2694f6336817961b18e82b40a94e8054"
SRC_URI[sha256sum] = "ca24e52fdd6ad7af419241eef8c41e65ef4e3499c6b252df13f697919eb24e3c"

GEM_NAME = "i18n"

inherit rubygems
