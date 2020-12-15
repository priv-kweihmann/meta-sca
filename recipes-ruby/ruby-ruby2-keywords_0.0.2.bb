SUMMARY = "RubyGem: ruby2_keywords"
DESCRIPTION = "Shim library for Module#ruby2_keywords"
HOMEPAGE = "https://github.com/ruby/ruby2_keywords"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://README.md;beginline=49;endline=51;md5=01d7030a41f29358c867339f69f6a581"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b7d86b3293ecbc313f99df21b948ab60"
SRC_URI[sha256sum] = "145c91edd2ef4c509403328ed05ae4387a8841b7a3ae93679e71c0fd3860ec9e"

GEM_NAME = "ruby2_keywords"

inherit rubygems
