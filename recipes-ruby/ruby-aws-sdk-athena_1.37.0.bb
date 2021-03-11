SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8ed407af8c54f7b7c3e0dca830b15fb2"
SRC_URI[sha256sum] = "1203ef5959c898fe29e895cd13d307ab76ba5ad5b9f73b037eb92bfa9017dd93"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
