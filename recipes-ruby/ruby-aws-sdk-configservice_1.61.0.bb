SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "cee0c6f57959d267e8337e6599e32324"
SRC_URI[sha256sum] = "8b3481cfc6130cd5b25b6bd15c678576f5fb88a0e1851c2b640749f28694cced"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
