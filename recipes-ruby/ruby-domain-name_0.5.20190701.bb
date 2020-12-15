SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause & BSD-3-Clause & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-unf"

SRC_URI[md5sum] = "a8795f080f54fd961c27ff9aef1d9e59"
SRC_URI[sha256sum] = "000a600454cb4a344769b2f10b531765ea7bd3a304fe47ed12e5ca1eab969851"

GEM_NAME = "domain_name"

inherit rubygems
