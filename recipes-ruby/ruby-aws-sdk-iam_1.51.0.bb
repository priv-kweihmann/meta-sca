SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1cd837ad482a648e0540ae3553c90f8f"
SRC_URI[sha256sum] = "c9947f37bf1fc703e4aa9019bc46564b51774c134ec49b56bc14794d17324774"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
