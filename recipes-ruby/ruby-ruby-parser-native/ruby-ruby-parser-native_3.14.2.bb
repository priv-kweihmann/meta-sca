SUMMARY = "ruby_parser (RP) is a ruby parser written in pure ruby"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=88;md5=b3e341281591d1a60de96a4508ad2e69"

DEPENDS += "ruby-sexp-processor-native"

SRC_URI[md5sum] = "17aac27f0c448628368282ecd870b805"
SRC_URI[sha256sum] = "cc28083336412b4604f7c7c766cbd8b6075d27d7a9962a9979e70e2ea56f0c27"

GEM_NAME = "ruby_parser"

inherit sca-sanity
inherit rubygemsnative
