SUMMARY = "Flog reports the most tortured code in an easy to read pain report"
HOMEPAGE = "https://github.com/seattlerb/flog"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=44;md5=b3e341281591d1a60de96a4508ad2e69"

DEPENDS += "\
            ruby-path-expander-native \
            ruby-ruby-parser-native \
            ruby-sexp-processor-native \
           "

SRC_URI[md5sum] = "0c4d4707090126e0faa43063c089f24c"
SRC_URI[sha256sum] = "b5aa03696c075a7d672cd5e24cee36e4b76c23e200a2add0618b834270d1c763"

GEM_NAME = "flog"

inherit rubygemsnative
