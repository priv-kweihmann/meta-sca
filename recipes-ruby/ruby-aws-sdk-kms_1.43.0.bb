SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8e1c586b68b6e0fee9737ee90329548b"
SRC_URI[sha256sum] = "506f5131062df1f14e582ac1e4bdc8d917992e0980e04fe82f46e9ac8903ed06"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
