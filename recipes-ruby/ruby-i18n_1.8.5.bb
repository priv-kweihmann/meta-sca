SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "feed0dc2335b2834e6fbb912a6481a1e"
SRC_URI[sha256sum] = "f3bb7c9e89804cde8264b89f47f4746527f7293e7b5e4c74e66a9b70cfe97a94"

GEM_NAME = "i18n"

inherit rubygems
