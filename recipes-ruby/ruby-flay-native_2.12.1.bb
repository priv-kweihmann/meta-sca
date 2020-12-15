SUMMARY = "Flay analyzes code for structural similarities"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=102;md5=518e1b15cff40ff5f98a13fd2a39f0e5"

DEPENDS += "\
            ruby-erubis-native \
            ruby-path-expander-native \
            ruby-ruby-parser-native \
            ruby-sexp-processor-native \
           "

SRC_URI[md5sum] = "b2c4d45c0654ac18a13288697c512a37"
SRC_URI[sha256sum] = "677ff6fc3727ee297a25357e908dc9cf1243eb7e61b8852d595873a4907ac4d7"

GEM_NAME = "flay"

inherit rubygems
inherit native
