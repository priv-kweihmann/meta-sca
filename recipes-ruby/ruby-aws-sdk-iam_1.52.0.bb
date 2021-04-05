SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "237401fd2945aad9ff6164e105e106ee"
SRC_URI[sha256sum] = "91b1f1efd64a7dbd5a649235a16d0868feafb5c7890c3f48094fb8d17d01ac8e"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
