SUMMARY = "RubyGem: ruby_parser"
DESCRIPTION = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizingracc--which does by default use a C extension)"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=86;endline=109;md5=5db85eba7780ac1765a03fe0e5ec1657"

DEPENDS += "ruby-sexp-processor-native"
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "12251efe73812ecb53410fab089997e1"
SRC_URI[sha256sum] = "08483a56975d30115eb44749ae357773bab90264692c004422277fe0e760beb8"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit native
