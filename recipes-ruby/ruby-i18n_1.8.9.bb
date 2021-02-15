SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "eb6d2f8a637b693c687ecf5846bf1866"
SRC_URI[sha256sum] = "62a877ff6b5fdb4c20ca614c6bfcd6abd7b426d883069e59ce41a6744758e622"

GEM_NAME = "i18n"

inherit rubygems
