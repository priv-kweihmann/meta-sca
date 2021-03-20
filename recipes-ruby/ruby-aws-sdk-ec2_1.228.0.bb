SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "33f28bc29bd723d87795018a6049405a"
SRC_URI[sha256sum] = "30e0a7472053f75b4ddc04e60243ead52d95dbc0919e960a4547061fb606f2be"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
