SUMMARY = "ruby_parser (RP) is a ruby parser written in pure ruby"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=88;md5=b3e341281591d1a60de96a4508ad2e69"

DEPENDS += "ruby-sexp-processor-native"

SRC_URI[md5sum] = "872f89b07a16d427eba72f5cd6c3938c"
SRC_URI[sha256sum] = "53784028e46407d43b5a704f10f105db00241102ee4402d2a55755b5fa2ad42c"

GEM_NAME = "ruby_parser"

inherit rubygemsnative
