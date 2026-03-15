# Chroma

![app banner](banner.png)

Chroma is a [chromatic tuner](https://en.wikipedia.org/wiki/Chromatic_scale), the perfect app to help you tune your musical instruments with precision and elegance.

---

### 🚀 2026 Modernization Update
This repository has been fully modernized from its original 2021 state while preserving the original brand and aesthetics.

*   **Modern Stack**: Updated to **Gradle 8.7**, **Java 17**, and **Kotlin 1.9.24**.
*   **Jetpack Compose**: Migrated to modern Compose with **BOM 2024.05.00** and **Compose 1.6.7**.
*   **Edge-to-Edge UI**: Implemented full transparent status and navigation bars with modern `WindowInsets` support.
*   **Architecture**: Migrated to **Koin 3.5.3** for better lifecycle management and modularity.
*   **Stability**: Addressed legacy compiler warnings and enforced modern Android 15+ standards.

---

Features:
* Basic and complete UI modes
* Noise suppressor
* Letter (A B C) and Solfege (Do Re Mi) notations
* Sharp (♯) and Flat (♭) semitones
* Tuning precision (from 0 to -5/+5 cents)
* Many available pitch detection algorithms (powered by [TarsosDSP](https://github.com/JorenSix/TarsosDSP/)):
    * [YIN](http://audition.ens.fr/adc/pdf/2002_JASA_YIN.pdf)
    * [FFT YIN (Fast Fourier Transform)](https://en.wikipedia.org/wiki/Fast_Fourier_transform)
    * [MPM (McLeod Pitch Method)](http://miracle.otago.ac.nz/tartini/papers/A_Smarter_Way_to_Find_Pitch.pdf)
    * [AMDF (Average Magnitude Difference Function)](https://ieeexplore.ieee.org/abstract/document/1162598)
    * [DYWA (Dynamic Wavelet)](https://pdfs.semanticscholar.org/1ecf/ae4b3618f92b4267912afbc59e3a3ea1d846.pdf)

[![download app button](https://play.google.com/intl/en_us/badges/images/badge_new.png)](https://play.google.com/store/apps/details?id=cafe.adriel.chroma)

## Screenshots

![app screenshots](screenshots.png)