SUMMARY = "RubyGem: aws-sdk-ecr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Registry (Amazon ECR)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e53a38299343c7a7cd5820a71cbad154"
SRC_URI[sha256sum] = "2a733de04c9b00d68f0941c334bd272f45c4c289300d3fa23cfda2d1eaf2be64"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
