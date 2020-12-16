SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4e666890bc199978b625e5b81936676f"
SRC_URI[sha256sum] = "98552e85902f59f1d4334fb7f0555790ad445a6ed94ef4d1b4696b6e7f8ee043"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
