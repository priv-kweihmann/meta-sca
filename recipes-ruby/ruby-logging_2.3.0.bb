SUMMARY = "RubyGem: logging"
DESCRIPTION = "**Logging** is a flexible logging library for use in Ruby programs based on thedesign of Java's log4j library"
HOMEPAGE = "http://rubygems.org/gems/logging"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6b49bc59d892746c7eda6db23862f61"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-little-plugger \
                  ruby-multi-json"

SRC_URI[md5sum] = "bd8cbc98f36af473775cb7b748b0dcbf"
SRC_URI[sha256sum] = "c98298313ea08725f822facc59c801bceca876ee34fd57f022e752143b83755e"

GEM_NAME = "logging"

inherit rubygems
