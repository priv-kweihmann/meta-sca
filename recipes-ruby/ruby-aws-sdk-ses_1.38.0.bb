SUMMARY = "RubyGem: aws-sdk-ses"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Email Service (Amazon SES)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b1d326abab073f6ed4de885f17080e70"
SRC_URI[sha256sum] = "d04322b6995f9270f54e75b49c225bbd3175f8c157f82fdc6be69ba0a12ed225"

GEM_NAME = "aws-sdk-ses"

inherit rubygems
