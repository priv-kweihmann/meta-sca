SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "708034996da91e4f4007f43c6b36e734"
SRC_URI[sha256sum] = "96b433a93476e9fac69578b45645a799ba739feaca805551d2cb533793c0427d"

GEM_NAME = "i18n"

inherit rubygems
